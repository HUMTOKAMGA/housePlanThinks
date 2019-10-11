package com.hpt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hpt.model.PieceMo;
import com.hpt.model.UserMo;
import com.hpt.service.PieceService;


@RestController
public class PieceCtrl {
	
	@Autowired
	private PieceService pieceService;

	@CrossOrigin(origins ="http://localhost:4200")
	@RequestMapping("/hpt/pieces")
	public List<PieceMo> getAllPieces(){
		return pieceService.getAllPieces();
	}
	
	@RequestMapping("/hpt/users/{userId}/pieces/{pieceId}")
	public Optional<PieceMo> getPieceUser(@PathVariable int pieceId){
		return pieceService.getPiece(pieceId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/hpt/users/{userId}/pieces")
	public void addPieceUser(@RequestBody PieceMo pieceMo, @PathVariable int userId ) {
		pieceMo.setUserMo(new UserMo(userId, "","", false, "", "", false, false));
		pieceService.addPiece(pieceMo);
	}
	
	/**
	 * 
	 * @param pieceMo
	 * @param userId
	 */
	@RequestMapping(method = RequestMethod.PUT, value="/hpt/users/{userId}/pieces/{pieceId}")
	public void updatePieceUser(@RequestBody PieceMo pieceMo, @PathVariable int userId ) {
		pieceMo.setUserMo(new UserMo(userId, "", "", false, "", "", false, false));
		pieceService.updatePiece(pieceMo);
	}
	
	/**
	 * function delete a piece
	 * @param pieceId
	 */
	@RequestMapping(method = RequestMethod.DELETE, value="/hpt/users/{userId}/pieces/{pieceId}")
	public void deletePieceUser(@PathVariable int pieceId ) {
		pieceService.deletePiece(pieceId);
	}
}
