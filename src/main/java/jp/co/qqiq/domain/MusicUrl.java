package jp.co.qqiq.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MusicURLs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicUrl {

  @Id
  @GeneratedValue
  private Long id;

  private String url;

  @ManyToOne
  private Music music;

}
