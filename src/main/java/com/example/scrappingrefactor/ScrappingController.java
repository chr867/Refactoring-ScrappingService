package com.example.scrappingrefactor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ScrappingController {
    private final ScrappingService ss;

    /* 재고 스크래핑 초기실행 */
    @PostMapping("/login")
    public String stockInit(String paperMakerCode) {
        ss.apiBackCtl("0", paperMakerCode);
        return "로그인";
    }

    /* 재고 스크래핑 */
    @GetMapping("/stocks/searching")
    public String stockSearching(@PathVariable String paperMakerCode) {
        ss.apiBackCtl("1", paperMakerCode);
        return "재고 검색";
    }

    /* 납품처 선택 */
    @GetMapping("/delivery/searching")
    public String deliveryPlaceSearch(@PathVariable String paperMakerCode) {
        ss.apiBackCtl("2", paperMakerCode);

        return "납품처 검색";
    }

    /* 제지사 주문등록 */
    @PostMapping("/order")
    public String paperMakerOrder(@PathVariable String paperMakerCode) {
        ss.apiBackCtl("3", paperMakerCode);
        return "주문 등록";
    }
}
