package com.steamledge.routes

import com.steamledge.data.model.BasicStaffInfo
import com.steamledge.data.model.Duration
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "http://192.168.1.144:8081"

private val durations = listOf(
    Duration("9-July-2019", ""),
    Duration("9-July-2019", "9-July-2020"),
    Duration("9-July-2019", ""),
    Duration("9-July-2019", "9-June-2020"),
    Duration("9-July-2019", ""),
)

private val staffs = listOf(
    BasicStaffInfo(1, "SL11", "Abubakar Bello", 24, "male", "$BASE_URL/picture/steamledge_logo.jpg", "Senior Software Engineer", "Build Software", false, false, durations[0]),
    BasicStaffInfo(2, "SL12", "Aliyu Kamilu", 34, "male", "$BASE_URL/picture/steamledge_logo.jpg", "Software Developer", "Build Software", false, false, durations[0]),
    BasicStaffInfo(3, "SL13", "Toyin Samuel", 27, "female", "$BASE_URL/picture/steamledge_logo.jpg", "Thrust Lead", "Build Software", false, false, durations[0]),
    BasicStaffInfo(4, "SL14", "Ibrahim Ismail", 41, "male", "$BASE_URL/picture/steamledge_logo.jpg", "Product Manager", "Build Software", false, false, durations[0]),
    BasicStaffInfo(5, "SL15", "Ummi Abdulsalam", 29, "female", "$BASE_URL/picture/steamledge_logo.jpg", "Head of TAP", "Build Software", false, false, durations[0]),
)

fun Route.staffDetails() {
    get("/staff-details/all") {
        call.respond(
            HttpStatusCode.OK,
            staffs
        )
    }

//    Sensitive Details
//    get("/staff-details") {
//        call.parameters["staffID"]
//    }
}