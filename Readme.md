spring leacy project 생성-> 
Servers에서 tomcat 더블클릭 누르고 modules에서 path설정
servlet-context에서 
<context:component-scan>에 controller랑 service셋팅
내가 이걸 bean객체로 사용하겠다고 선언해주는거인듯
*다른 컨트롤러가 들어가면 다 셋팅해주던가 
와일드카드로 붙혀서 셋팅해주면 됨.



home.jsp에 인코딩 설정 ->


ojdbc8 연결

프로젝트 properties-> java buildpath에서 ojdbc8.jar 등록

pom.xml에서 
oraclejdbc , mybatis 등 dependency추가
이거추가

mybatis 사용하게 되면 sqlsessiontemplate 는 3.0버전 전이고 
mapper.xml로 사용하는 거는 3.0이후 방법임.

만약 mapper.xml로 이용하여 mvc를 구현하게된다면

root-context에 

<mybatis-spring:scan base-package="패키지명" />

이걸 사용해줘야함.

수정중

외장하드에 git 담아놨었는데 너무 느려서 workingTree변경하여 로컬에 새로 저장했음.

**중요**
만약 clone으로 해당 프로젝트를 가져올 시 maven 업데이트를 필히 실시해주거나, projectClean을 이용하여 다시 셋팅을 맞춰주고 
project 마우스 우클릭-> properties->Project Facets ->Java->Runtimes 탭-> Apache Tomocat 체크 후 Apply 해주어야 정상적으로 작동됨.
