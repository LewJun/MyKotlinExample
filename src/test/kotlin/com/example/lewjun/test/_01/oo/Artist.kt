package com.example.lewjun.test._01.oo

/**
 * @author LewJun
 * *
 * @version v0.1 2018/04/10 18:20 LewJun Exp $$
 */
class Artist {
    var id: Long? = null
    var name: String? = null
    var url: String? = null
    var mbid: String? = null

    override fun toString(): String {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", mbid='" + mbid + '\'' +
                '}'
    }
}
