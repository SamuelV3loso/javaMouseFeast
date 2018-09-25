package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazon.mousefeast.repository.ProdutoRepository;

@Controller
@RequestMapping( "/produto" )
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
}
