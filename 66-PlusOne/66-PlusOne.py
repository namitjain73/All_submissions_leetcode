# Last updated: 8/28/2025, 2:52:22 AM
class Solution(object):
    def plusOne(self, List):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        s=''
        L=[]
        for i in List:
            s+=str(i)
        s=int(s)+1
        s=str(s)
        for i in s:
            L.append(int(i))
        return L