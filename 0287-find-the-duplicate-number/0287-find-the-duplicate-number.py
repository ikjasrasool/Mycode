class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        unique_set = set()
        for num in nums:
            if num in unique_set:
                return num
            unique_set.add(num)