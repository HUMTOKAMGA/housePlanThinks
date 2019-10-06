package com.hpt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hpt.model.PieceMo;

public interface PieceRepo extends CrudRepository<PieceMo, Integer>{
	public List<PieceMo> findByUserMoId(int idUser);
}
