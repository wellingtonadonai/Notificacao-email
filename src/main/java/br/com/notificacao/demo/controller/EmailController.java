package br.com.notificacao.demo.controller;

import br.com.notificacao.demo.business.EmailService;
import br.com.notificacao.demo.business.dto.TarefasDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDto tarefasDto){
        emailService.enviaEmail(tarefasDto);
        return ResponseEntity.ok().build();
    }
}
