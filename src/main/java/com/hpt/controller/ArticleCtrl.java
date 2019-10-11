package com.hpt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hpt.model.ArticleMo;
import com.hpt.model.PieceMo;
import com.hpt.model.UserMo;
import com.hpt.service.ArticleService;

@RestController
public class ArticleCtrl {
	
	/**
	 * Injection dependency  ArticleService
	 */
	@Autowired
	private ArticleService articleService;
	
	/**
	 * 
	 * @return
	 */
	@CrossOrigin(origins ="http://localhost:4200")
	@RequestMapping("/hpt/articles")
	public List<ArticleMo> getAllArticles(){
		return articleService.getAllArticles();
	}
	
	/**
	 * 
	 * @param pieceId
	 * @return
	 */
	@RequestMapping("/hpt/pieces/{pieceId}/articles")
	public List<ArticleMo> getAllPieceArticles(@PathVariable int pieceId){
		return articleService.getAllPieceArticles(pieceId);
	}
	
	/**
	 * 
	 * @param userId
	 * @param pieceId
	 * @return
	 */
//	@RequestMapping("/hpt/users/{userId}/pieces/{pieceId}/articles")
//	public List<ArticleMo> getAllUserPieceArticles(@PathVariable int userId, @PathVariable int pieceId){
//		return articleService.getAllUserPiecesArticles(pieceId, userId);
//	}
	
	/**
	 * 
	 * @param articleMo
	 * @param pieceId
	 * @param userId
	 */
	@RequestMapping(method = RequestMethod.POST, value="/hpt/users/{userId}/pieces/{pieceId}/articles")
	public void addArticleUserPiece(@RequestBody ArticleMo articleMo, @PathVariable int pieceId, @PathVariable int userId ) {
		articleMo.setUserMo(new UserMo(userId, "","", false, "", "", false, false));
		articleMo.setPieceMo(new PieceMo(pieceId, "", "", userId));
		articleService.addArticle(articleMo);
	}
	
	/**
	 * 
	 * @param articleMo
	 * @param pieceId
	 * @param userId
	 */
	@RequestMapping(method = RequestMethod.PUT, value="/hpt/users/{userId}/pieces/{pieceId}/articles/{articleId}")
	public void updateArticleUserPiece(@RequestBody ArticleMo articleMo, @PathVariable int pieceId, @PathVariable int userId ) {
		articleMo.setUserMo(new UserMo(userId, "","", false, "", "", false, false));
		articleMo.setPieceMo(new PieceMo(pieceId, "", "", userId));
		articleService.updateArticle(articleMo);
	}
	
	/**
	 * 
	 * @param articleId
	 */
	@RequestMapping(method = RequestMethod.DELETE, value="/hpt/users/{userId}/pieces/{pieceId}/articles/{articleId}")
	public void deletePieceUser(@PathVariable int articleId ) {
		articleService.deleteArticle(articleId);
	}
}
