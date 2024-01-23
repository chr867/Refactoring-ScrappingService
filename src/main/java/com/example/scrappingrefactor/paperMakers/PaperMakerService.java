package com.example.scrappingrefactor.paperMakers;

public sealed interface PaperMakerService permits MoorimServiceImpl, HansolServiceImpl, HankookServiceImpl,
        CnServiceImpl, HongwonServiceImpl {
    void login();
    void getStocks();
    void getDeliveryPlace();
    void doOrder();
}
