package jp.co.qqiq;

import java.net.URI;
import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

  @Autowired
  DataSourceProperties properties;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Profile("pws")
  @Bean(destroyMethod = "close")
  DataSource dataSource() throws URISyntaxException {
    String url;
    String username;
    String password;

    String databaseUrl = System.getenv("DATABASE_URL");
    if (databaseUrl != null) {
      URI dbUri = new URI(databaseUrl);
      url = "jdbc:postgresql://" + dbUri.getHost() + ":" + dbUri.getPort() + dbUri.getPath();
      username = dbUri.getUserInfo().split(":")[0];
      password = dbUri.getUserInfo().split(":")[1];
    } else {
      url = this.properties.getUrl();
      username = this.properties.getUsername();
      password = this.properties.getPassword();
    }

    DataSourceBuilder factory = DataSourceBuilder.create(this.properties.getClassLoader()).url(url).username(username)
        .password(password);
    return factory.build();
  }

}
