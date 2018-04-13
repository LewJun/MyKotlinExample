package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/12 14:23 LewJun Exp $$
 */
enum class GetTemperature1Ret constructor(var desc0: String, var desc1: String) {
    OPENSIMM90614FAIL("Open simm90614 fail", "打开文件错误"),
    SIMM90614IOCTLFAIL("Simm90614 ioctl fail", "读文件错误"),
    NOSENSORFOUND("No sensor found", "未安装传感器"),
    SENSORERROR("Sensor error", "温度传感器错误");

    companion object {
        fun getCode(d: String): GetTemperature1Ret? {
            return values().firstOrNull { it.desc0 == d }
        }

        fun getTemp(d: String) =
                if (values().any { it.desc0 == d }) "0" else d

        val descs: List<String> by lazy {
            println("computed")
            values().toList().map { it.desc1 }
        }
    }
}
