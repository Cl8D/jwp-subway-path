# 🚊 지하철 미션

## Pair: 져니 [⛄️](http://github.com/cl8d), 가비 [😊](https://github.com/iamjooon2)

## ✔ 기능 요구사항
**- 역**
  - [x] 역 이름은 최소 3글자부터 최대 10글자까지 가능하다.
  - [x] 역 이름은 중복될 수 없다.

**- 노선**
  - [x] 노선 이름은 최소 3글자부터 최대 10글자까지 가능하다.
  - [x] 노선 이름은 중복될 수 없다.
  - [ ] 노선 색상은 비어있을 수 없다.

**- 구간**
    - [ ] 시작 역, 끝 역, 거리 정보를 관리한다.

**- 노선 역 추가**
  - 노선에 역을 추가할 때, 시작 역, 끝 역, 거리 정보를 받는다.
    - [ ] 거리 정보는 1 이상이어야 한다. 
  - 노선에 역 정보가 하나도 존재하지 않는 경우, 기준이 되는 역이 없어도 등록이 가능하다.
    - [ ] 노선에 이미 등록된 역 정보가 존재한다면, 시작 역과 끝 역 중 하나는 노선에 존재해야 한다. 아니면 예외가 발생한다.
  - [ ] 요청한 끝 역이 상행 종점이라면, 시작 역이 상행 종점이 된다.
  - [ ] 요청한 시작 역이 하행 종점이라면, 끝 역이 하행 종점이 된다.
  - 요청한 시작 역이 이미 노선에 존재하는 경우, 존재하는 역의 하행 방향의 가중치와, 입력받은 거리를 비교한다.
    - [ ] 만약, 입력받은 거리가 더 크거나 같다면 예외가 발생한다.
    - [ ] 입력받은 거리가 더 작다면, 노선에 추가한다. 이때, 끝 역과 하행 방향 역 사이의 가중치는, 기존에 존재하던 가중치에서 입력받은 거리를 뺀 값으로 갱신한다.
  - 요청한 끝 역이 이미 노선에 존재하는 경우, 존재하는 역의 상행 방향의 가중치와, 입력받은 거리를 비교한다.
    - [ ] 만약, 입력받은 거리가 더 크거나 같다면 예외가 발생한다.
    - [ ] 입력받은 거리가 더 작다면, 노선에 추가한다. 이때, 시작 역과 상행 방향 역 사이의 가중치는, 기존에 존재하던 가중치에서 입력받은 거리를 뺀 값으로 갱신한다.

**-  노선 역 삭제**
  - [ ] 노선에 역이 2개만 존재하면, 제거 시 예외가 발생한다.
  - [ ] 상행 종점이나 하행 종점은 그냥 제거한다.
  - [ ] 존재하지 않는 역이라면 예외가 발생한다.
  - [ ] 중간에 존재하는 역이라면, 양 옆의 거리를 더하여 가중치를 갱신한다.

**-  노선 조회**
  - [ ] 하나의 노선에 존재하는 모든 역을 조회한다.

**-  노선 목록 조회**
  - [ ] 존재하는 모든 노선의 역을 조회한다.

