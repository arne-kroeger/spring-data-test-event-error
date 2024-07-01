package com.gutzmann.ocr.management.extract.application;

import com.gutzmann.ocr.management.document.DocumentReadyToRun;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class ExtractionEventListener  {

    @ApplicationModuleListener
    public void handle(DocumentReadyToRun event) {
        System.out.println(event.documentId());
    }

}
