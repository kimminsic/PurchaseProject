package com.task.taskInfo.Service;

import com.task.taskInfo.Repository.BuyItemRepository;
import com.task.taskInfo.Repository.BuyerRepository;
import com.task.taskInfo.Repository.ProductInfoRepository;
import com.task.taskInfo.Repository.RegisCompanyRepository;
import com.task.taskInfo.Response.BasicResponse;
import com.task.taskInfo.dao.BuyitemInfo;
import com.task.taskInfo.dao.ProductInfo;
import com.task.taskInfo.dao.RegisCompany;
import com.task.taskInfo.dao.BuyerInfo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private final ProductInfoRepository productInfoRepository;
    private final BuyerRepository buyerRepository;
    private final RegisCompanyRepository regisCompnyRepository;

    private final BuyItemRepository buyItemRepository;
    // 상품 정보 서비스
        public ResponseEntity<BasicResponse> findProduct(){
            List<ProductInfo> productList = productInfoRepository.findAll();

            BasicResponse basicResponse = BasicResponse.builder()
                    .total_item_count(productList.size())
                    .list(new ArrayList<>(productList)).build();

            return new ResponseEntity<>(basicResponse, HttpStatus.OK);

        }
        
        // 구매자 정보 서비스
        public ResponseEntity<BasicResponse> findBuyer(){
            List<BuyerInfo> buyerList = buyerRepository.findAll();

            BasicResponse basicResponse = BasicResponse.builder()
                    .total_item_count(buyerList.size())
                    .list(new ArrayList<>(buyerList)).build();

            return new ResponseEntity<>(basicResponse,HttpStatus.OK);
        }

        // 등록업체 정보 서비스
        public ResponseEntity<BasicResponse> findRegis(){
            List<RegisCompany> regisCompanyList = regisCompnyRepository.findAll();

            BasicResponse basicResponse = BasicResponse.builder()
                    .total_item_count(regisCompanyList.size())
                    .list(new ArrayList<>(regisCompanyList)).build();

            return new ResponseEntity<>(basicResponse,HttpStatus.OK);
        }

    public ResponseEntity<BasicResponse> findPrice() {
            List<BuyitemInfo> buyitemInfoList = buyItemRepository.findAll();

            BasicResponse basicResponse = BasicResponse.builder()
                    .total_item_count(buyitemInfoList.size())
                    .list(new ArrayList<>(buyitemInfoList)).build();

            return new ResponseEntity<>(basicResponse,HttpStatus.OK);
    }
}
