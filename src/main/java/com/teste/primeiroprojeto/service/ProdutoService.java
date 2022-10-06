package com.teste.primeiroprojeto.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroprojeto.model.Produto;
import com.teste.primeiroprojeto.repository.ProdRepository;





@Service
public class ProdutoService  {
    
    @Autowired
    private ProdRepository produtoRepository;


    public List<Produto> obterTodos(){
        return produtoRepository.findAll();

    }
    
    
    public Optional<Produto>obterPorId(Integer id){
        return produtoRepository.findById(id);
    }


    public  Produto adicionar( Produto produto){
        
       return produtoRepository.save(produto);
    }


    public void deletar(Integer id){
        produtoRepository.deleteById(id);
    }

    public Produto atualizar(Produto produto){
        return produtoRepository.save(produto);
    }


   

    

}
