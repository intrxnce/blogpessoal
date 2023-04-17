package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

<<<<<<< HEAD
@Repository
<<<<<<< HEAD
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
=======
=======
>>>>>>> 3231321a28625b6f024915ede6e40e5d5bc84a51
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
>>>>>>> 1abb9912871ecf294df4d80d45794e236f245e1b

	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	//SELECT * FROM tb_postagens WHERE titulo LIKE "%???%";
}
