package com.example.notekeeper

// Both the courseId and courseTile are immutable. They cannot be changed after assignment.
data class CourseInfo(val courseId: String, val courseTitle: String) {
    override fun toString(): String {
        return courseTitle
    }
}

// All parameters in NoteInfo are immutable
data class NoteInfo(var course: CourseInfo?=null, var noteTitle: String?=null, var noteText: String?=null)