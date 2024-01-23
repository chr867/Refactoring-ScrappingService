package com.example.scrappingrefactor.paperMakers;

import org.springframework.core.env.Environment;

public final class HansolServiceImpl extends paperMakerImpl implements PaperMakerService {
    private final String pmCode = "HS";

    public HansolServiceImpl(Environment env) {
        super(env);
    }

    @Override
    public void login() {
        /* Unirest, Jsoup을 사용해 구현했던 코드 */
        env.getProperty(pmCode + ".login"); // application.yml 에서 관리하는 URL
    }

    @Override
    public void getStocks() {
        /* Unirest, Jsoup을 사용해 구현했던 코드 */
        env.getProperty(pmCode + ".getStocks"); // application.yml 에서 관리하는 URL
    }

    @Override
    public void getDeliveryPlace() {
        /* Unirest, Jsoup을 사용해 구현했던 코드 */
        env.getProperty(pmCode + ".getDelivery"); // application.yml 에서 관리하는 URL
    }

    @Override
    public void doOrder() {
        /* Unirest, Jsoup을 사용해 구현했던 코드 */
        env.getProperty(pmCode + ".order"); // application.yml 에서 관리하는 URL
    }
}
