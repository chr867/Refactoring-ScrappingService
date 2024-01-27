package com.example.scrappingrefactor.paperMakers;

public sealed interface PaperMakerService permits MoorimServiceImpl, HansolServiceImpl, HankookServiceImpl,
        CnServiceImpl, HongwonServiceImpl {
    /* 제지사 서비스가 반드시 구현 해야하는 함수는 interface에 넣었음 */
    void login();
    void getStocks();
    void getDeliveryPlace();
    void doOrder();
}
