# istio
[이스티오](https://istio.io/)를 MSA 아키텍쳐에 적용하는 샘플 프로젝트

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
