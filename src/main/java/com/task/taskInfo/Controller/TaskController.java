package com.task.taskInfo.Controller;

import com.task.taskInfo.Response.BasicResponse;
import com.task.taskInfo.Service.TaskService;
import com.task.taskInfo.dao.BuyerInfo;
import com.task.taskInfo.dao.RegisCompany;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class TaskController {
    private final TaskService taskService;

    // 상품 정보 리스트 조회
    @GetMapping("/productList")
    public ResponseEntity<BasicResponse> ProductListGet(){
        return taskService.findProduct();
    }

    // 등록업체 리스트 조회
    @GetMapping("/RegisCompanyList")
    public ResponseEntity<BasicResponse> RegisCompanyListGet(){
        return taskService.findRegis();
    }

    // 구매자 리스트 조회
    @GetMapping("/BuyerList")
    public ResponseEntity<BasicResponse> BuyerListGet(){
        return taskService.findBuyer();
    }

    // 구매 정보 조회
    @GetMapping("/PurchaseList")
    public ResponseEntity<BasicResponse> priceListGet(){return taskService.findPrice();}
}
