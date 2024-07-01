package com.gutzmann.ocr.management.document.application;

import com.gutzmann.ocr.management.UseCase;
import com.gutzmann.ocr.management.document.domain.Document;
import com.gutzmann.ocr.management.document.domain.DocumentRepository;

@UseCase
public class AddNewDocumentUseCase {

    DocumentRepository repository;

    public AddNewDocumentUseCase(DocumentRepository repository) {
        this.repository = repository;
    }

    public String execute(String externalIdentification, String campaignId) {
        Document documentToStore = new Document(externalIdentification, campaignId);

        repository.save(documentToStore);

        return documentToStore.id;
    }

}
