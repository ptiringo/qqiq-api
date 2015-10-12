package jp.co.qqiq.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.qqiq.domain.Music;
import jp.co.qqiq.repository.MusicRepository;

@Service
@Transactional
public class MusicService {

  @Autowired
  private MusicRepository musicRepository;

  public List<Music> findAll() {
    return musicRepository.findAll();
  }

}
