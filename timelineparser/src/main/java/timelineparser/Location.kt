package timelineparser

data class Location(var timestampMs: Long, var latitudeE7: Long, var longitudeE7: Long, var accuracy: Long) {
}