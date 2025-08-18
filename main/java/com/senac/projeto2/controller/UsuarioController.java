package com.senac.projeto2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
@Tag(name="Usuario", description="API para gerenciamento dos usuarios do sistema")

public class UsuarioController {

    @GetMapping("/listar")
    @Operation(summary = "Listar os usuarios do sistema")
    public String listar(){
        return "Listado com sucesso";
    }

    @GetMapping("/listarPorIdUsuario/{idUsuario}")
    @Operation(summary = "Listar os usuarios do sistema pelo ID do usuario")
    public String listarPorIdUsuario(@PathVariable("idUsuario") Integer idUsuario){
        return "Listado um usuario por ID "+ idUsuario + " com sucesso";
    }

    @PostMapping("/criar")
    @Operation(summary = "Criar os usuario do sistema")
    public  String criar(){
        return "Usuário criado com sucesso!";
    }


    @PutMapping("/atualizar")
    @Operation(summary = "Atualizar os usuarios do sistema")
    public String atualizar(){
        return "Usuario";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Deletar os usuarios do sistema")
    public String apagar(){
        return "Usuario apagado com sucesso!";
    }
}