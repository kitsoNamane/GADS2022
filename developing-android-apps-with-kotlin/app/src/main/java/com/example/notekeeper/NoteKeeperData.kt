package com.example.notekeeper

// Both the courseId and courseTile are immutable. They cannot be changed after assignment.
class CourseInfo(val courseId: String, val courseTitle: String)

// All parameters in NoteInfo are immutable
class NoteInfo(var course: CourseInfo, var noteTitle: String, var noteText: String)