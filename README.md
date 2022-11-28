# 구매 프로젝트
## 1.언어: Java, SQL
## 2.프레임워크 : Spring boot
## 3.사용한 패키지 : JAVA
## 4.셋팅법
### 해당 디렉토리에서 docker-compose up 실행

## 5.조회방법
#### 1.상품정보 (상품명, 금액, 등록일자, 등록업체명)
##### http://localhost:8081/api/productList
#### 2.등록업체 (등록업체명, 업체 대표자 명, 전화번호)
##### http://localhost:8081/api/RegisCompanyList
#### 3.구매자 (이름, 연락처)
##### http://localhost:8081/api/BuyerList
#### 4. 구매정보 (상품정보 , 구매자, 금액, 구매일자, 구매번호)
##### http://localhost:8081/api/PurchaseList