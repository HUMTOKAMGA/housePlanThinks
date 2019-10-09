package com.hpt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hpt.model.ArticleMo;

public interface ArticleRepo extends CrudRepository<ArticleMo, Integer>{
	public List<ArticleMo> findByUserMoId(int userId);
	public List<ArticleMo> findByPieceMoId(int pieceId);
	//public List<ArticleMo> findByPieceMoUserMo(int pieceId, int userId);
}
