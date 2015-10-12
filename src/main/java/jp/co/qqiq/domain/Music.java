package jp.co.qqiq.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Musics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Music {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(nullable = false)
  private String title;

  @Temporal(TemporalType.DATE)
  private Date releaseDate;

  @OneToMany(mappedBy = "music")
  private List<MusicUrl> urls;

  private String composer;

  private String songwriter;

}
