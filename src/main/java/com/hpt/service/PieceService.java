package com.hpt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.model.PieceMo;
import com.hpt.repository.PieceRepo;

@Service
public class PieceService {

	@Autowired
	private PieceRepo pieceRepo;

	// Get All pieces
	public List<PieceMo> getAllPieces() {
		List<PieceMo> pieceMo = new ArrayList<>();
		pieceRepo.findAll().forEach(pieceMo::add);
		return pieceMo;
	}

	// Get piece by id
	public Optional<PieceMo> getPiece(int pieceId) {
		return pieceRepo.findById(pieceId);
	}

	// Add piece
	public void addPiece(PieceMo pieceMo) {
		pieceRepo.save(pieceMo);
	}

	// Update piece
	public void updatePiece(PieceMo pieceMo) {
		pieceRepo.save(pieceMo);
	}

	// Delete piece by id
	public void deletePiece(int pieceId) {
		pieceRepo.deleteById(pieceId);
	}

	// Get All user pieces by userId
	public List<PieceMo> getAllUserPieces(int userId) {
		List<PieceMo> pieceMo = new ArrayList<>();
		pieceRepo.findByUserMoId(userId).forEach(pieceMo::add);
		return pieceMo;
	}

}
