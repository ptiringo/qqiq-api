package jp.co.qqiq.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.qqiq.domain.Music;
import jp.co.qqiq.service.MusicService;

@RestController
@RequestMapping("api/musics")
public class MusicRestController {

  @Autowired
  private MusicService musicService;

  @RequestMapping(method = RequestMethod.GET)
  List<Music> getMusics() {
    return musicService.findAll();
  }

}
