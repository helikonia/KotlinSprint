package org.example.lesson11

class Participant(
    val nickname: String,
    val avatar: String,
    var status: String,
)

class VoiceRoom(
    val cover: String,
    val title: String,

    ) {
    val participants = mutableListOf<Participant>()
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateStatus(nickname: String, newStatus: String) {
        for (participant in participants) {
            if (participant.nickname == nickname) {
                participant.status = newStatus
                return
            }
        }
    }
}

fun main() {
    val participant1 = Participant(
        nickname = "Rose",
        avatar = "Peony",
        status = "Speaking",
    )
    val room1 = VoiceRoom(
        cover = "Snake",
        title = "Medicine"
    )
    room1.addParticipant(participant1)
    room1.updateStatus("Rose", "Speaking")

}
