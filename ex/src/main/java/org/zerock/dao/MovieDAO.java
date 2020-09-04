package org.zerock.dao;

import java.util.List;

import org.zerock.vo.MovieVO;
 
public interface MovieDAO {
    
    public List<MovieVO> selectMovie() throws Exception;
    
}