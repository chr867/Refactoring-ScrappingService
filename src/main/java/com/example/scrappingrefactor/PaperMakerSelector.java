package com.example.scrappingrefactor;

import com.example.scrappingrefactor.paperMakers.*;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaperMakerSelector {
    private final Environment env;

    public PaperMakerService selectPaperMaker(String paperMakerCode){
        PaperMakerService result = null;
        switch (paperMakerCode){
            case "MR": result = new MoorimServiceImpl(env); break;
            case "HS": result = new HansolServiceImpl(env); break;
            case "HK": result = new HankookServiceImpl(env); break;
            case "CN": result = new CnServiceImpl(env); break;
            case "HW": result = new HongwonServiceImpl(env); break;
        }

        return result;
    };
}
