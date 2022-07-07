package com.example.notekeeper

object DataManager {
    // These are class Properties. Their types are inferred
    val courses = HashMap<String, CourseInfo>()
    var notes = ArrayList<NoteInfo>()

    // This will initialize the class Properties when the object is created
    init {
        initializeCourses()
        initializeNotes()
    }

    // Only DataManger class can call this function
    private fun initializeCourses() {
        var course = CourseInfo("android_intent", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", courseTitle = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(courseTitle = "Jave Fundamentals: The Jave Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", courseTitle = "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var note = NoteInfo(courses["android_intent"]!!,"Dynamic Intent Resolution", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["android_async"]!!, "Asynchronous code execution","Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_lang"]!!,"The java language basic", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_core"]!!,"The java language core principles", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["android_async"]!!, "Asynchronous code execution","Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_lang"]!!,"The java language basic", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_core"]!!,"The java language core principles", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["android_async"]!!, "Asynchronous code execution","Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_lang"]!!,"The java language basic", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_core"]!!,"The java language core principles", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["android_async"]!!, "Asynchronous code execution","Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_lang"]!!,"The java language basic", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(courses["java_core"]!!,"The java language core principles", "Wow, intents allow componets to be resolved at runtime")
        notes.add(note)
    }
}