# istio
[이스티오](https://istio.io/)를 MSA 아키텍쳐에 적용하는 샘플 프로젝트


### 요구사항   
환자의 진료 상세 내역 조회 API   

**Response Format**   

    "id" : 1,  
    "patientName" : "나환자",   
    "gender" : MALE,
    "birthDate" : "1990-01-01",
    "treatmentStartDate" : "2021-03-02T11:00:00",
    "treatmentEndDate" : "2021-03-02T11:30:00",
    "paymentStatus" : "COMPLETTED",
    "paymentAmount" : 10000


## Architecture
 ![](https://user-images.githubusercontent.com/77223336/169686401-02ef30d9-4c85-4f02-ac50-ad859b4b1d2b.png)
 

### 적용기술 
- Dynamic service discovery  
- Load balancing  
- TLS termination  
- Circuit breakers  
- Timeout  
- Health checks  
- HPA (HorizontalPodAutoscaler)   
- Staged rollouts with %-based traffic split  
- Fault injection  
- Rich metrics (Prometheus/Grafana)  
- Distributed Tracing (Jager)     
- Kiali  
- Helm  
<img width="994" alt="스크린샷 2022-07-01 오전 2 07 57" src="https://user-images.githubusercontent.com/77223336/176736956-9f92f898-bb13-4eac-b205-f414d6829d19.png">
<img width="997" alt="스크린샷 2022-07-01 오전 2 07 51" src="https://user-images.githubusercontent.com/77223336/176736968-67f94baf-9315-48ca-88d5-e6f43f994843.png">
<img width="1128" alt="스크린샷 2022-07-01 오전 2 07 45" src="https://user-images.githubusercontent.com/77223336/176736985-ef0518f8-4328-4678-b8c3-5f1e4e427665.png">  
  
  
#### 전체 발표자료 : https://future-bat-47e.notion.site/Service-Mesh-Istio-b1bd435ede714a7b9abd1ec39a7c974f
