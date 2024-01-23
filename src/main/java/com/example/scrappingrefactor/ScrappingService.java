package com.example.scrappingrefactor;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScrappingService {
    private final PaperMakerSelector selector;

    public void apiBackCtl(String number, String paperMakerCode) {
        switch (number){
            case "0": this.doLogin(paperMakerCode); break;
            case "1": this.getStocks(paperMakerCode); break;
            case "2": this.getDeliveryPlace(paperMakerCode); break;
            case "3": this.doOrder(paperMakerCode); break;
        }

    }

    private void doLogin(String paperMakerCode) {
        selector.selectPaperMaker(paperMakerCode).login();
    }

    private void getStocks(String paperMakerCode) {
        selector.selectPaperMaker(paperMakerCode).getStocks();
    }

    private void getDeliveryPlace(String paperMakerCode) {
        selector.selectPaperMaker(paperMakerCode).getDeliveryPlace();

    }

    private void doOrder(String paperMakerCode) {
        selector.selectPaperMaker(paperMakerCode).doOrder();
    }

}
