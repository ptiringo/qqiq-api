DROP TABLE Musics IF EXISTS;
DROP TABLE MusicUrls IF EXISTS;

create TABLE Musics (
  id integer generated BY DEFAULT AS identity,
  composer varchar(255),
  release_date date,
  songwriter varchar(255),
  title varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

create TABLE MusicUrls (
  id bigint generated BY DEFAULT AS identity,
  url varchar(255),
  music_id integer,
  PRIMARY KEY (id)
);

ALTER TABLE MusicUrls 
  ADD CONSTRAINT FK_MusicUrls 
  FOREIGN KEY (music_id) 
  REFERENCES musics;