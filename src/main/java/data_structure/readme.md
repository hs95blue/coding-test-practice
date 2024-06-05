1. 배열 (Array)
   설명: 동일한 타입의 고정된 크기의 연속된 메모리 공간에 저장된 요소들의 집합입니다.
   특징: 빠른 인덱스 접근, 크기가 고정됨.
2. 연결 리스트 (Linked List)
   설명: 각 요소가 노드로 구성되며, 노드는 데이터와 다음 노드를 가리키는 포인터를 포함합니다.
   단일 연결 리스트 (Singly Linked List): 각 노드가 다음 노드를 가리킵니다.
   이중 연결 리스트 (Doubly Linked List): 각 노드가 이전 노드와 다음 노드를 가리킵니다.
   특징: 요소 삽입 및 삭제가 용이함, 인덱스 접근이 느림.
3. 스택 (Stack)
   설명: 후입선출(LIFO, Last In First Out) 구조로, 마지막에 삽입된 요소가 가장 먼저 제거됩니다.
   특징: push (삽입), pop (제거) 연산.
4. 큐 (Queue)
   설명: 선입선출(FIFO, First In First Out) 구조로, 먼저 삽입된 요소가 가장 먼저 제거됩니다.
   일반 큐 (Queue): enqueue (삽입), dequeue (제거) 연산.
   우선순위 큐 (Priority Queue): 각 요소가 우선순위를 가지며, 높은 우선순위의 요소가 먼저 제거됩니다.
   원형 큐 (Circular Queue): 큐의 마지막 요소가 첫 요소와 연결되어 원형 형태를 가집니다.
5. 트리 (Tree)
   설명: 계층적인 데이터 구조로, 노드와 노드 간의 부모-자식 관계로 구성됩니다.
   이진 트리 (Binary Tree): 각 노드가 최대 두 개의 자식을 가짐.
   이진 탐색 트리 (Binary Search Tree, BST): 왼쪽 자식 노드는 부모 노드보다 작고, 오른쪽 자식 노드는 부모 노드보다 큼.
   힙 (Heap): 완전 이진 트리로, 최대 힙과 최소 힙으로 나뉨.
   AVL 트리 (AVL Tree): 자가 균형 이진 탐색 트리.
   레드-블랙 트리 (Red-Black Tree): 자가 균형 이진 탐색 트리로, 노드가 색상 속성을 가짐.
6. 그래프 (Graph)
   설명: 정점(노드)과 간선(에지)으로 구성된 데이터 구조로, 정점 간의 관계를 나타냄.
   무방향 그래프 (Undirected Graph): 간선이 방향을 가지지 않음.
   유방향 그래프 (Directed Graph): 간선이 방향을 가짐.
   가중 그래프 (Weighted Graph): 간선에 가중치가 있음.
7. 해시 테이블 (Hash Table)
   설명: 키-값 쌍을 저장하는 데이터 구조로, 해시 함수를 사용하여 키를 인덱스로 변환합니다.
   특징: 빠른 검색, 삽입, 삭제 연산.
   추가적으로 알면 좋은 자료구조들
   트라이 (Trie)

설명: 문자열을 저장하고 효율적으로 검색하기 위한 트리 구조.
B-트리 (B-Tree)

설명: 자가 균형 트리로, 데이터베이스 및 파일 시스템에서 사용됨.
데크 (Deque, Double-Ended Queue)

설명: 양쪽 끝에서 삽입과 삭제가 가능한 큐.
자바에서 자료구조를 사용할 때 알아두면 좋은 클래스 및 인터페이스
List 인터페이스: ArrayList, LinkedList
Set 인터페이스: HashSet, TreeSet
Map 인터페이스: HashMap, TreeMap
Queue 인터페이스: LinkedList, PriorityQueue
Deque 인터페이스: ArrayDeque, LinkedList