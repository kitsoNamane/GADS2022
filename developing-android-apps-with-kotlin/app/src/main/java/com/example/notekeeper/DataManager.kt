package com.example.notekeeper

class DataManager {
    // These are class Properties. Their types are inferred
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    // This will initialize the class Properties when the object is created
    init {
        initializeCourses()
    }

    // Only DataManger class can call this function
    private fun initializeCourses() {
        var course = CourseInfo("android_intest", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", courseTitle = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(courseTitle = "Jave Fundamentals: The Jave Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", courseTitle = "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}