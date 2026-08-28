from graphlib import TopologicalSorter, CycleError
class Solution:
    def canFinish(self, numCourses, prerequisites):
        graph = {i: set() for i in range(numCourses)}
        for course, prerequisite in prerequisites:
            graph[course].add(prerequisite)
        try:
            list(TopologicalSorter(graph).static_order())
            return True
        except CycleError:
            return False