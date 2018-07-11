package com.greenfoxacademy.grootproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianRestController {

  @GetMapping("/groot")
  public ResponseEntity<?> grootTranslater(@RequestParam(value = "received", required = false) String received) {
    if (received != null) {
      GrootMessage message = new GrootMessage(received);
      return ResponseEntity.status(HttpStatus.OK).body(message);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error());
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> yonduSpeedCalculator(@RequestParam(value = "distance") double distance,
                                                @RequestParam(value = "time") double time) {
    Yondu yondu = new Yondu(distance, time);
    return ResponseEntity.status(HttpStatus.OK).body(yondu);
  }
}
