package jp.co.qqiq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.qqiq.domain.Music;

public interface MusicRepository extends JpaRepository<Music, Integer> {

}
