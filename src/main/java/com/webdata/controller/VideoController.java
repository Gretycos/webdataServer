package com.webdata.controller;

import com.alibaba.fastjson.JSON;
import com.webdata.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VideoController {
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

    // 查询动漫
    @RequestMapping(value = "/animes", method = RequestMethod.POST)
    public Object findAnimes(@RequestParam Map<String,String> params){
        String title = "%"+params.get("title")+"%";
        String code = params.get("code");//方式 来源 升降序
        int page = Integer.parseInt(params.get("page")) - 1;
        if (page<0) page = 0;
        PageRequest pageRequest = PageRequest.of(page,30);

        Map<String,Object> res = new HashMap<>();
        if(title.equals("%null%")){//无搜索
            switch (code){
                case "000": // 来源: bilibili&tencent 排序:热度降序
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendDesc(l0,pageRequest));
                    break;
                case "001": // 来源: bilibili&tencent 排序:热度升序
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendAsc(l0,pageRequest));
                    break;
                case "010": // 来源: bilibili 排序:热度降序
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendDesc(l1,pageRequest));
                    break;
                case "011": // 来源: bilibili 排序:热度升序
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendAsc(l1,pageRequest));
                    break;
                case "020": // 来源: tencent 排序:热度降序
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendDesc(l2,pageRequest));
                    break;
                case "021": // 来源: tencent 排序:热度升序
                    res.put("data",serviceInterface.findAnimesBySourceOrderByTrendAsc(l2,pageRequest));
                    break;
                default:
                    res.put("data",null);
            }
        }else{//搜索
            switch (code){
                case "000": // 来源: bilibili&tencent 排序:热度降序
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendDesc(title,l0,pageRequest));
                    break;
                case "001": // 来源: bilibili&tencent 排序:热度升序
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendAsc(title,l0,pageRequest));
                    break;
                case "010": // 来源: bilibili 排序:热度降序
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendDesc(title,l1,pageRequest));
                    break;
                case "011": // 来源: bilibili 排序:热度升序
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendAsc(title,l1,pageRequest));
                    break;
                case "020": // 来源: tencent 排序:热度降序
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendDesc(title,l2,pageRequest));
                    break;
                case "021": // 来源: tencent 排序:热度升序
                    res.put("data",serviceInterface.findAnimesByTitleAndSourceOrderByTrendAsc(title,l2,pageRequest));
                    break;
                default:
                    res.put("data",null);
            }
        }
        return JSON.toJSONString(res);
    }


    //查询电影
    @RequestMapping(value = "/movies", method = RequestMethod.POST)
    public Object findMovies(@RequestParam Map<String,String> params){
        String title = "%"+params.get("title")+"%";
        String code = params.get("code");//方式 来源 升降序
        int page = Integer.parseInt(params.get("page")) - 1;
        if (page<0) page = 0;
        PageRequest pageRequest = PageRequest.of(page,30);

        Map<String,Object> res = new HashMap<>();
        if(title.equals("%null%")){//无搜索
            switch (code){
                case "000": // 来源: bilibili&tencent 排序:热度降序
                    res.put("data",serviceInterface.findMoviesBySourceOrderByTrendDesc(l0,pageRequest));
                    break;
                case "001": // 来源: bilibili&tencent 排序:热度升序
                    res.put("data",serviceInterface.findMoviesBySourceOrderByTrendAsc(l0,pageRequest));
                    break;
                case "010": // 来源: bilibili 排序:热度降序
                    res.put("data",serviceInterface.findMoviesBySourceOrderByTrendDesc(l1,pageRequest));
                    break;
                case "011": // 来源: bilibili 排序:热度升序
                    res.put("data",serviceInterface.findMoviesBySourceOrderByTrendAsc(l1,pageRequest));
                    break;
                case "020": // 来源: tencent 排序:热度降序
                    res.put("data",serviceInterface.findMoviesBySourceOrderByTrendDesc(l2,pageRequest));
                    break;
                case "021": // 来源: tencent 排序:热度升序
                    res.put("data",serviceInterface.findMoviesBySourceOrderByTrendAsc(l2,pageRequest));
                    break;
                default:
                    res.put("data",null);
            }
        }else{//搜索
            switch (code){
                case "000": // 来源: bilibili&tencent 排序:热度降序
                    res.put("data",serviceInterface.findMoviesByTitleAndSourceOrderByTrendDesc(title,l0,pageRequest));
                    break;
                case "001": // 来源: bilibili&tencent 排序:热度升序
                    res.put("data",serviceInterface.findMoviesByTitleAndSourceOrderByTrendAsc(title,l0,pageRequest));
                    break;
                case "010": // 来源: bilibili 排序:热度降序
                    res.put("data",serviceInterface.findMoviesByTitleAndSourceOrderByTrendDesc(title,l1,pageRequest));
                    break;
                case "011": // 来源: bilibili 排序:热度升序
                    res.put("data",serviceInterface.findMoviesByTitleAndSourceOrderByTrendAsc(title,l1,pageRequest));
                    break;
                case "020": // 来源: tencent 排序:热度降序
                    res.put("data",serviceInterface.findMoviesByTitleAndSourceOrderByTrendDesc(title,l2,pageRequest));
                    break;
                case "021": // 来源: tencent 排序:热度升序
                    res.put("data",serviceInterface.findMoviesByTitleAndSourceOrderByTrendAsc(title,l2,pageRequest));
                    break;
                default:
                    res.put("data",null);
            }
        }
        return JSON.toJSONString(res);
    }

}
