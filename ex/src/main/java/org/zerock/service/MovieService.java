package org.zerock.service;

import java.util.List;

import org.zerock.vo.MovieVO;
 
public interface MovieService {
    
    public List<MovieVO> selectMovie() throws Exception;
}