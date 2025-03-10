# 자동차 경주: 기능 요구사항

주어진 기능 요구사항에서 논의를 통해 몇 가지의 요구사항이 추가되었습니다.

## 자동차

- [x] 엔진이 켜져 있는 경우, 전진한다.
- [x] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다. 단, n은 1 이상의 정수이다.

## 서킷 (Circuit)
자동차들을 다루는 일급 컬렉션입니다.
- [x] 모든 자동차들에게 이동할 기회를 준다.
- [x] 자동차들의 현재 상태들을 반환한다.
- [x] 우승자를 반환한다.

## 자동차 엔진

- [x] 랜덤한 수가 4 이상이면, 전원을 켠다. 그렇지 않으면 끈다.
- [x] 현재 전원 상태를 반환한다.

### 자동차 이름

- [x] 이름은 5자 이하만 가능하며, 공백이 될 수 없다.

## 랜덤

- [x] 주어진 범위 내에서 랜덤한 수를 반환한다.

## 입력

- [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- [x] 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다. 이동 횟수는 1 이상 100 이하의 정수이다.

## 출력

- [x] 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다. 나아간 정도는 `-`의 개수로 나타낸다.
- [x] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 예외 처리

- [x] 유효하지 않은 입력값을 받은 경우, `[ERROR]`로 시작하는 오류 메시지를 출력한 뒤, 해당 부분부터 다시 입력받는다.
