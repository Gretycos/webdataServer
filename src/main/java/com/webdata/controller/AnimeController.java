package com.webdata.controller;

import com.alibaba.fastjson.JSON;
import com.webdata.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.*;

@RestController
public class AnimeController {
    @Autowired
    private ServiceInterface serviceInterface;

    List<String> l0 = Arrays.asList("bilibili","tencent");
    List<String> l1 = Arrays.asList("bilibili");
    List<String> l2 = Arrays.asList("tencent");
    /*
    * title=string
    * source=0:all,1:bilibili,2:tencent
    * order=0:desc,1:asc
    * page=int
    * */
    @RequestMapping(value = "/animes", method = RequestMethod.POST)
    public Object findAnimes(@RequestParam Map<String,Object> params){
        String title = (String)params.get("title");
        String code = (String) params.get("code");
        int page = (Integer) params.get("page");
        PageRequest pageRequest = PageRequest.of(page,20);

        Map<String,Object> res = new HashMap<>();
        if(title.equals("")){//无搜索
            switch (code){
                case "00":
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendDesc(l0,pageRequest));
                    break;
                case "01":
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendAsc(l0,pageRequest));
                    break;
                case "10":
                     res.put("data",serviceInterface.findAnimesBySourceOrderByTrendDesc(l1,pageRequest));
                    break;
                case "11":
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendAsc(l1,pageRequest));
                    break;
                case "20":
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendDesc(l2,pageRequest));
                    break;
                case "21":
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendAsc(l2,pageRequest));
                    break;
            }
        }else{//搜索
            switch (code){
                case "00":
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendDesc(title,l0,pageRequest));
                    break;
                case "01":
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendAsc(title,l0,pageRequest));
                    break;
                case "10":
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendDesc(title,l1,pageRequest));
                    break;
                case "11":
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendAsc(title,l1,pageRequest));
                case "20":
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendDesc(title,l2,pageRequest));
                case "21":
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendAsc(title,l2,pageRequest));
            }
        }
        return JSON.toJSONString(res);
    }


}
