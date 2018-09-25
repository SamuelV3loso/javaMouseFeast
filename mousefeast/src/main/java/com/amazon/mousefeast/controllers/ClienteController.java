package com.amazon.mousefeast.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazon.mousefeast.repository.ClienteRepository;

@Controller
@RequestMapping( "/cliente" )
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
}
