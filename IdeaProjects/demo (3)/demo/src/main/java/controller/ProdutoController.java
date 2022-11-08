package controller;


import model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.ProdutoRepository;
import model.Produto;

import java.util.Optional;

@RestController
@RequestMapping(value="/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produto/{id}")
    public Optional<Produto> buscarPorId
            (@PathVariable(value="id") int id)
    {
        return produtoRepository.findById(id);
    }




}
