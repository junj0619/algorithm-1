// 2分法 O(logN)
// 停在start, end 不交錯
// 最後判斷應該取start 還是 end
while(start + 1 < end){
  int mid = start + (end - start)/2;
  if (A[mid] == target){
    return A[mid];
  } else if (A[mid] > target) {
    start = A[mid];
  } else {
    end = A[mid];
  }
}

if (A[start] == target){
  return A[start];
}

if (A[end] == target){
  return A[end];
}

//////////////////////////////////////
// Quick Sort O(NlogN), 最壞O(N^2)
// 目標left, right 交錯 
// (left <= right)
// 等於pivot 需交換, 以避免 1,1,1,1,1,1 
// (A[left] < pivot, A[right] > pivot)
//////////////////////////////////////
if (start >= end){
  return;
}
int pivot = A[(start + end)/2];
int left = start; right = end;
while (left <= right){
  while (left <= right && A[left] < pivot){
    left ++;
  }
  
  while (left <= right && A[right] > pivot){
    right --;
  }
  
  if (left <= right){
    int temp = A[right];
    A[right] = A[left];
    A[left] = temp;
    left ++;
    right --;
  }
}

QuickSort(A, start, right);
QuickSort(A, left, end);