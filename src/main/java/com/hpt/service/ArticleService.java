package com.hpt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.model.ArticleMo;
import com.hpt.repository.ArticleRepo;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepo articleRepo;
	
	// Get All articles
	public List<ArticleMo> getAllArticles(){
		List<ArticleMo> articleMo = new ArrayList<>();
		articleRepo.findAll()
		.forEach(articleMo::add);
		return articleMo;
	}
	
	// Get article by id
	public Optional<ArticleMo> getArticle(int articleId){
		return articleRepo.findById(articleId);
	}
	
	// Add article
	public void addArticle(ArticleMo articleMo) {
		articleRepo.save(articleMo);
	}
	
	// Update article
	public void updateArticle(ArticleMo articleMo) {
		articleRepo.save(articleMo);
	}
	
	//Delete article by idArticle
	public void deleteArticle(int articleId) {
		articleRepo.deleteById(articleId);
	}
	
	// Get All article user by idUser
	public List<ArticleMo> getAllUserArticles(int userId){
		List<ArticleMo> articleMo = new ArrayList<>();
		articleRepo.findByUserMoId(userId)
		.forEach(articleMo::add);
		return articleMo;
	}
	
	// Get All articles find by user and piece
//	public List<ArticleMo> getAllUserPiecesArticles(int userId, int pieceId){
//		List<ArticleMo> articleMo = new ArrayList<>();
//		articleRepo.findByPieceMoUserMo(pieceId, userId)
//		.forEach(articleMo::add);
//		return articleMo;
//	}
	
	public List<ArticleMo> getAllPieceArticles(int pieceId){
		List<ArticleMo> articleMo = new ArrayList<>();
		articleRepo.findByUserMoId(pieceId)
		.forEach(articleMo::add);
		return articleMo;
	}
}
